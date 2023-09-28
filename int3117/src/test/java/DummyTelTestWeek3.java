import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static nam.DummyTel.totalCost;

public class DummyTelTestWeek3 {
    /*
     * Kiểm tra giá trị biên cho giờ (hour):
     * 
     * hour = 0 (giá trị biên dưới)
     * hour = 8 (giá trị biên dưới)
     * hour = 9 (trong khoảng)
     * hour = 17 (trong khoảng)
     * hour = 18 (giá trị biên trên)
     * hour = 23 (giá trị biên trên)
     * hour = 24 (giá trị biên trên)
     * Kiểm tra giá trị biên cho phút (minute) và giây (second):
     * 
     * minute = 0, second = 0 (giá trị biên dưới)
     * minute = 30, second = 30 (trong khoảng)
     * minute = 59, second = 59 (giá trị biên trên)
     * Kiểm tra giá trị biên cho thời lượng cuộc gọi (duration):
     * 
     * duration = 1 (giá trị biên dưới)
     * duration = 59 (giá trị biên dưới)
     * duration = 60 (trong khoảng)
     * duration = 119 (trong khoảng)
     * duration = 120 (giá trị biên trên)
     * Kiểm tra các trường hợp tính giá cước:
     * 
     * Thời gian cuộc gọi nằm trong khung giờ đặc biệt (từ 18:00 đến 08:00).
     * Thời gian cuộc gọi nằm trong khung giờ bình thường (từ 08:00 đến 18:00).
     * Thời lượng cuộc gọi ngắn (dưới 60 phút).
     * Thời lượng cuộc gọi dài (60 phút trở lên).
     */


    // hour = 7 (giá trị biên dưới), minute = 45, second = 30 (trong khoảng)
    @Test
    void DummyTelTest1() {
        assertEquals(10.5, totalCost(7, 45, 30, 40));
    }

    // hour = 25 (vượt quá giới hạn)
    @Test
    void DummyTelTest2() {
        assertEquals(-1, totalCost(25, 15, 30, 70));
    }

    // minute = 0, second = 0 (giá trị biên dưới)
    @Test
    void DummyTelTest3() {
        assertEquals(7.88, totalCost(18, 0, 0, 30));
    }

    // hour = 22, minute = 45 (trong khoảng), second = 0 (giá trị biên dưới), duration = 120 (giá trị biên trên)
    @Test
    void DummyTelTest4() {
        assertEquals(26.78, totalCost(22, 45, 0, 120));
    }
}
