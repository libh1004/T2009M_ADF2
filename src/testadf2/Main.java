package testadf2;

import java.util.ArrayList;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        boolean flag = true;
        ArrayList<Passenger> passengers = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        while (flag) {
            System.out.println("Vui long chon chuc nang: ");
            System.out.println("1. Them cho ngoi");
            System.out.println("2. Thay doi thong tin khach hang");
            System.out.println("3. Hien thi bang khach hang");
            System.out.println("4. Thoat");
            int a = sc.nextInt();
            if (a == 1) {
//                PriorityQueue<Passenger> pPg = new PriorityQueue<>();
//                pPg.add()
                System.out.println("Nhap id khach hang: ");
                int id = sc.nextInt();
                System.out.println("Nhap ten khach hang: ");
                String passengerName = sc.next();
                System.out.println("Nhap so dien thoai: ");
                String phone = sc.next();
                System.out.println("Nhap dia chi: ");
                String address = sc.next();
                System.out.println("Nhap ngay den: ");
                String dateOfDeparture = sc.next();
                System.out.println("Nhap ngay di: ");
                String dateOfReturn = sc.next();
                passengers.add(new Passenger(id, passengerName, address, phone, dateOfReturn, dateOfDeparture));
            } else if (a == 2) {
                System.out.println("Nhap id khach hang can sua thong tin: ");
                int id = sc.nextInt();
                for (Passenger p : passengers) {
                    if (p.getId() == id) {
                        System.out.println("Nhap ten khach hang: ");
                        sc.nextLine();
                        p.setPassengerName(sc.nextLine());
                        System.out.println("Nhap so dien thoai: ");
                        p.setPhone(sc.next());
                        System.out.println("Nhap dia chi: ");
                        p.setAddress(sc.next());
                        System.out.println("Nhap ngay den: ");
                        p.setDateOfDeparture(sc.next());
                        System.out.println("Nhap ngay di: ");
                        p.setDateOfReturn(sc.next());
                        break;
                    }
                }

            } else if (a == 3) {
                for (Passenger p : passengers) {
                    System.out.println(p.getPassengerName() + "--" + p.getPhone() + "--" + p.getAddress() + "--" + p.getDateOfDeparture() + "--" + p.getDateOfReturn());
                }
            } else if (a == 4) {
                flag = false;
            }
        }
    }
}
