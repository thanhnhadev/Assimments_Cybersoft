package BookingModel;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class PostBody_booking {
    private String firstname;
    private String lastname;
    private int totalprice;
    private boolean depositpaid;
    private BookingDates bookingdates;
    private String additionalneeds;

    // Optional fields (for auth reuse if needed)
    private String username;
    private String password;
    private String bookingid;
    private String hydra_auth;
}
