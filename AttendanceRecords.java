import java.io.*;
import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class AttendanceRecords {

    public static void attendance(String file) {
        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            String line = reader.readLine(); // Read the header line and skip it

            while ((line = reader.readLine()) != null) {
                String[] row = line.split(",");

                if (row.length >= 6) {
                    try {
                        double hoursWorked = calculateHoursWorked(row[4], row[5]);
                        System.out.printf(
                                "|Employee ID: %-8s |Last Name: %-15s |First Name: %-15s |Date: %-15s |Log In: %-8s |Log Out: %-8s |Hours Worked: %-10.2f%n",
                                row[0],
                                row[1],
                                row[2], row[3],
                                row[4], row[5], hoursWorked);
                    }

                    catch (Exception e) {
                        System.out.println("Error parsing log in/log out times for row: ");
                    }
                }
                System.out.println();
            }
        }

        catch (FileNotFoundException e) {
            System.out.println("File not found: ");
        }

        catch (IOException e) {
            System.out.println("Error reading file: ");
        }
    }

    // Calculate the hours worked between log in and log out times
    public static double calculateHoursWorked(String logIn, String logOut) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("H:mm");
        LocalTime logInTime = LocalTime.parse(logIn, formatter);
        LocalTime logOutTime = LocalTime.parse(logOut, formatter);
        long minutesWorked = ChronoUnit.MINUTES.between(logInTime, logOutTime);
        return minutesWorked / 60.0;
    }

}
