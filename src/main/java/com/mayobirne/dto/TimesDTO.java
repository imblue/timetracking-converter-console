package com.mayobirne.dto;

import java.util.Calendar;
import java.util.Date;

/**
 * Data needed for generating the Output-File.
 *
 * Created by christian on 03.09.16.
 */
public class TimesDTO {

    private Calendar date;

    private Date startTime;
    private Date endTime;

    private Integer projectNumber;
    private Integer categoryNumber;

    private String description;


    public String getStartTimeString() {
        return convertToTimeString(getStartTime());
    }

    public String getEndTimeString() {
        return convertToTimeString(getEndTime());
    }


    public Calendar getDate() {
        return date;
    }

    public void setDate(Calendar date) {
        this.date = date;
    }

    public Date getStartTime() {
        return startTime;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    public Date getEndTime() {
        return endTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    public Integer getProjectNumber() {
        return projectNumber;
    }

    public void setProjectNumber(Integer projectNumber) {
        this.projectNumber = projectNumber;
    }

    public Integer getCategoryNumber() {
        return categoryNumber;
    }

    public void setCategoryNumber(Integer categoryNumber) {
        this.categoryNumber = categoryNumber;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }


    private static String convertToTimeString(Date date) {

        if (date == null) {
            return "";
        }

        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);

        String hour = String.valueOf(calendar.get(Calendar.HOUR_OF_DAY));
        if (hour.length() == 1)  {
            hour = "0" + hour;
        }

        String minute = String.valueOf(calendar.get(Calendar.MINUTE));
        if (minute.length() == 1) {
            minute = "0" + minute;
        }

        return hour + ":" + minute + ":00";
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null || obj.getClass() != getClass()) {
            return false;
        }

        // Checking Date and Starttime should be enough

        TimesDTO otherDTO = (TimesDTO) obj;

        // Check Date
        Integer thisDateOfMonth = date.get(Calendar.DAY_OF_MONTH);
        Integer otherDateOfMonth = otherDTO.getDate().get(Calendar.DAY_OF_MONTH);
        if (!thisDateOfMonth.equals(otherDateOfMonth)) {
            return false;
        }

        // Check Starttime
        Calendar thisStartTimeCalendar = Calendar.getInstance();
        thisStartTimeCalendar.setTime(startTime);
        Integer thisStartMinute = thisStartTimeCalendar.get(Calendar.MINUTE);
        Integer thisStartHour = thisStartTimeCalendar.get(Calendar.HOUR_OF_DAY);

        Calendar otherStartTimeCalendar = Calendar.getInstance();
        otherStartTimeCalendar.setTime(otherDTO.getStartTime());
        Integer otherStartMinute = otherStartTimeCalendar.get(Calendar.MINUTE);
        Integer otherStartHour = otherStartTimeCalendar.get(Calendar.HOUR_OF_DAY);

        if (!thisStartMinute.equals(otherStartMinute) ||
                !thisStartHour.equals(otherStartHour)) {
            return false;
        }

        // Equals succeeded
        return true;
    }
}
