package HuongDoiTuong;

/**
 *
 * @author USER
 */
public interface Tax {
    public abstract double payTax(double income, String start_time,String end_time);
}