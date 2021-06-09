public class TimeConversion {

    public String timeConversion(String timeIn12HourFormat) {

        // 07:05:45PM

        // Split the 12 hour format time by ":"
        // Then we get 07, 05, 45PM
        // Then you can get the hour section value by doing "splitArray[0] % 12"
        // Join the sections ( remove the AM/PM part )

        // When the time is "AM"

//        String timeIn24HourFormat = "";
//
//        if(timeIn12HourFormat.contains("PM") && !timeIn12HourFormat.substring(0, 2).equals("12")){
//            String hourSection = timeIn12HourFormat.substring(0, 2);
//            timeIn24HourFormat = (Integer.parseInt(hourSection) + 12) + timeIn12HourFormat.substring(2, 8);
//        }else if(timeIn12HourFormat.contains("AM") && timeIn12HourFormat.substring(0, 2).equals("12")){
//            timeIn24HourFormat = "00" + timeIn12HourFormat.substring(2, 8);
//        }else{
//            timeIn24HourFormat = timeIn12HourFormat.substring(0, 8);
//        }

        String[] timeIn24HourFormatSplitArray = timeIn12HourFormat.split(":");
        int hh = Integer.parseInt(timeIn24HourFormatSplitArray[0]);
        int mm = Integer.parseInt(timeIn24HourFormatSplitArray[1]);
        int ss = Integer.parseInt(timeIn24HourFormatSplitArray[2].substring(0, 2));
        String ampm = timeIn24HourFormatSplitArray[2].substring(2, 4);

        String timeIn24HourFormat = "";

        if(ampm.equals("PM") && (hh != 12)){
            hh = hh + 12;
        } else if(ampm.equals("AM") && (hh == 12)){
            hh = 0;
        }

        timeIn24HourFormat = String.format("%02d", hh) + ":" + String.format("%02d", mm) + ":" +
                String.format("%02d", ss);

        return timeIn24HourFormat;
    }
}
