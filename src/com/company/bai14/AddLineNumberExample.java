package com.company.bai14;

import java.io.*;

public class AddLineNumberExample {
    public static void main(String[] args) throws Exception {
        String filePath = "C:\\Users\\anh\\IdeaProjects\\untitled2\\src\\com\\company\\bai14\\exam01_application_start";

        // code của Ắn
        try {
            BufferedReader br = new BufferedReader(new FileReader(filePath));// lớp BufferedReader hỗ trợ cải thiện hiệu xuất đọc file
            String currentLine;// thể hiện cho dòng hiện tại
            int rowNumber = 0;// đến số dòng
            while ((currentLine = br.readLine()) != null ){ // chạy vòng lặp từng dòng 1 kể từ dòng đầu tiên của file cho đến hết
                System.out.println(++rowNumber + ": " + currentLine);// đọc rồi in ra màn hình conslo
            }
            br.close();// đong lại, hay kết thúc
        } catch (Exception x){
            System.err.println("Fie không tồn tại or nội dung có lỗi!");
        }

        //code của thầy
        FileReader fr = new FileReader(filePath);
        BufferedReader br = new BufferedReader(fr);
        int rowNumber = 0;
        String rowData;
        while( (rowData=br.readLine())!= null ) {
            System.out.println(++rowNumber + ": " + rowData);
        }
        br.close(); fr.close();


    }
}