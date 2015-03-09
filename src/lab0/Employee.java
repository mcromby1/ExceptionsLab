package lab0;

import java.util.Date;

/**
 * In this challenge you need to address the probability that at some point the
 * arguments to method parameters may not be valid.
 * <p>
 * For example, String arguments may be null or empty; other objects may be
 * null; or primitive numbers may be out of acceptable range.
 * <p>
 * You need to validate ALL method parameters to make sure any and all arguments
 * are valid. The only exception is when any argument is acceptable based on
 * requirements. Fix the code below using if logic to validate method arguments
 * and throw IllegalArgumentException or a custom exception if the validation
 * fails.
 *
 * @author Jim Lombardo, jlombardo@wctc.edu
 * @version 1.00
 */
public class Employee {

    private int MAX_VACATION_DAYS = 28;
    private String firstName;
    private String lastName;
    private String ssn;
    private Date hireDate;
    private int daysVacation;

    public Employee() {
        firstName = "Unknown";
        lastName = "Unknown";
        ssn = "Unknown";
        hireDate = new Date();
        daysVacation = 0;
    }

    public Employee(String firstName, String lastName, String ssn, Date hireDate, int daysVacation) throws IllegalArgumentException {
        setFirstName(firstName);
        setLastName(lastName);
        setSsn(ssn);
        this.hireDate = hireDate;
        this.daysVacation = daysVacation;
    }

    public int getMAX_VACATION_DAYS() {
        return MAX_VACATION_DAYS;
    }

    public void setMAX_VACATION_DAYS(int MAX_VACATION_DAYS) {
        this.MAX_VACATION_DAYS = MAX_VACATION_DAYS;
    }

    public int getDaysVacation() {
        return daysVacation;
    }

    public void setDaysVacation(int daysVacation) {
        if (daysVacation > MAX_VACATION_DAYS || daysVacation < 0) {
            throw new IllegalArgumentException();
        }
        this.daysVacation = daysVacation;
    }

    public String getFirstName() {
        return firstName;
    }

    public final void setFirstName(String firstName) {
        if (firstName == null || firstName.length() < 2) {
            throw new IllegalArgumentException();
        }
        this.firstName = firstName;
    }

    public Date getHireDate() {
        return hireDate;
    }

    public void setHireDate(Date hireDate) {

        this.hireDate = hireDate;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {

        this.lastName = lastName;
    }

    public final String getSsn() {
        return ssn;
    }

    /* 
     333333333
     ssn must be either 9 digits in length or 
     11 characters following given format: 333-33-3333
     cannot be null
     */
    public void setSsn(String ssn) {
        if (ssn == null || ssn.length() < 9) {
            throw new IllegalArgumentException();
        } else {
            int index = ssn.indexOf("-");
            if (index > -1) {
                String[] parts = ssn.split("-");
                if(parts.length != 3){
                    throw new IllegalArgumentException();
                }
            }

        }
        this.ssn = ssn;
    }

}
