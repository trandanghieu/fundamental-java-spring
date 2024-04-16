package exceptions;

/*
    - Lỗi biên dịch - Compile error
        >> Lỗi tên gọi, cú pháp
    - Lỗi thực thi
        + Lỗi logic
            >>  Sai logic
        + Lỗi ngoại lệ - Exceptions
            >> Xảy ra trong quá trình thực thi chương tình
            >> Chương trình sẽ dừng lại ngay lập tức, đoạn mã phía sau sẽ không thực hiện được(crash)
            >> Nguyên nhân: Khi thực hiện xử lí tính toán, một phương thức, biểu thức có vấn đề sau khi
             thực hiện => sinh ra một ngoại lệ (exception) trên console và dừng chương trình.
            >> Exceptions là gì? -> Là events xảy ra tỏng quá trình thực thi chương trình, exceptions
             disrupt the normal flow of instructions
                * Trong java, Exceptions là một đối tượng tạo ra các phương thức bao gồm:
                   . Thông tin lỗi, hình thức lỗi
                   . Trạng thái của chương trình khi xảy ra lỗi
                * Exceptions object can be thrown and caught
                *Exceptions -> *IOExceptions ->FileNotFoundException  & SocketException
                            -> RuntimeExceptions -> IllegalArgumentException -> NumberFormatException
                  (Có thể xảy ra tại runtime)    -> IndexOutOfBoundsException -> ArrayIndexOutOfBoundsExceptions
                                                 -> ArithmeticException
                 Bắt buộc phải fix tại compile ngoại trừ RuntimeException và con của nó.
           + Checked và Unchecd Exceptions
             * Checked hay còn gọi là compile exception (Check tại compile)
             * Uncheckd hay còn gọi là runtime exception ( Không check tại compile)

             Do đó. Những class mà extend từ runtime là uncheck exception còn lại là checked exception

           + Xử lí ngoại lệ:
             Cách 1: Khối try - catch
              >> Đặt đoạn mã xảy ra ngoại lệ trong khối try
             Cách 2: Sử dụng throw, throws

           Exception's information
            >> Error line
            >> Eror info
 */
public class Ex01 {
    public static void main(String[] args) {

    }
}
