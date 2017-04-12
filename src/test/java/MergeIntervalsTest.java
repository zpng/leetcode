import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

/**
 * Created by zhangpeng on 2017/4/12.
 */
public class MergeIntervalsTest {

    @Test
    public void merge() throws Exception {

        List<Interval> intervals = new ArrayList<>();
        intervals.add(new Interval(1, 3));
        intervals.add(new Interval(2, 6));
        intervals.add(new Interval(8, 10));
        intervals.add(new Interval(15, 18));
        System.out.println(new MergeIntervals().merge(intervals));
    }

}