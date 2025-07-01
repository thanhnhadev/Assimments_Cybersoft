package model;

import io.restassured.http.Header;
import io.restassured.http.Headers;

public interface RequestCapability {

    Header defaultHeader = new Header("Content-type", "application/json; charset=UTF-8");



}
