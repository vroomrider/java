package com.java.practice.designpatterns.dto;

/**
 * 
 * @author pradeep_ramesh
 * 
 * @description Transfer Object is a simple POJO class having getter/setter
 *              methods and is serializable so that it can be transferred over
 *              the network.
 * 
 * @details Server Side business class normally fetches data from the database
 *          and fills the POJO and send it to the client or pass it by value.
 *          For client, transfer object is read-only.
 * 
 * @additionalDetails Client can create its own transfer object and pass it to
 *                    server to update values in database in one shot.
 *
 */
public class DTO {

}
