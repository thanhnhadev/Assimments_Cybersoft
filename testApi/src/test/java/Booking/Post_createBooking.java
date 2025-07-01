package Booking;

import com.google.gson.Gson; // Thư viện để chuyển đổi object Java thành JSON và ngược lại
import io.restassured.http.Header; // Dùng để tạo các header trong HTTP request
import io.restassured.response.Response; // Lưu trữ response trả về từ API
import io.restassured.specification.RequestSpecification; // Định nghĩa chi tiết cho HTTP request
import BookingModel.PostBody_booking; // Lớp model chính chứa thông tin cần gửi lên
import BookingModel.BookingDates; // Lớp model con chứa thông tin ngày checkin - checkout

import static io.restassured.RestAssured.given; // Hàm khởi tạo request
import static org.hamcrest.Matchers.equalTo; // Dùng để so sánh giá trị trả về

public class Post_createBooking {

    public static void main(String[] args) {

        String baseURL = "https://restful-booker.herokuapp.com"; // URL cơ bản của API

        RequestSpecification request = given(); // Khởi tạo request
        request.baseUri(baseURL); // Thiết lập URL gốc cho request

        request.header(new Header("Content-Type", "application/json")); // Thiết lập định dạng dữ liệu gửi đi là JSON
        request.header(new Header("Accept", "application/json")); // Thiết lập định dạng dữ liệu nhận về là JSON

        // GSON + Tạo dữ liệu gửi đi
        Gson gson = new Gson(); // Dùng để chuyển đổi object Java thành chuỗi JSON

        BookingDates dates = new BookingDates(); // Tạo object con chứa ngày tháng
        dates.setCheckin("2024-05-05"); // Thiết lập ngày checkin
        dates.setCheckout("2025-06-06"); // Thiết lập ngày checkout

        PostBody_booking postBodyBooking = new PostBody_booking(); // Tạo object chính chứa toàn bộ thông tin đặt phòng
        postBodyBooking.setFirstname("Bao"); // Thiết lập họ
        postBodyBooking.setLastname("Duong"); // Thiết lập tên
        postBodyBooking.setTotalprice(200); // Thiết lập tổng giá
        postBodyBooking.setDepositpaid(true); // Thiết lập đã thanh toán hay chưa (true = đã thanh toán)
        postBodyBooking.setBookingdates(dates); // Gán object ngày tháng vào trong body chính
        postBodyBooking.setAdditionalneeds("Breakfast"); // Thiết lập yêu cầu thêm (ví dụ: bữa sáng)

        // Gửi request POST và lấy response trả về
        Response response = request.body(gson.toJson(postBodyBooking)).post("/booking"); // Gửi dữ liệu đi dưới dạng JSON đến endpoint /booking
        response.prettyPrint(); // In đẹp nội dung JSON response ra màn hình

        // Kiểm tra response trả về
        response.then().statusCode(equalTo(200)); // Kiểm tra mã trạng thái HTTP là 200 (OK)
//        response.then().body("booking.firstname", equalTo("Bao")); // Kiểm tra phần firstname trả về có đúng không
        response.then().body("booking.firstname", equalTo(postBodyBooking.getFirstname())); // Kiểm tra phần firstname trả về có đúng không
        response.then().body("booking.lastname", equalTo(postBodyBooking.getLastname())); // Kiểm tra phần lastname trả về có đúng không

        String bookingID = response.jsonPath().getString("bookingid"); // Lấy giá trị từ response
        postBodyBooking.setBookingid(bookingID);
        System.out.println("BoookingID da duoc luu: " + postBodyBooking.getBookingid());

    }
}
