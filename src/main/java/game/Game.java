package game;

/**
 * @author : yusik
 * @date : 2019/10/26
 */
public interface Game<T> {
    void run();
    ResultEntity<T> getResultEntity();
}