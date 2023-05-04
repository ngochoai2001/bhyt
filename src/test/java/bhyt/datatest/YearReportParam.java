package bhyt.datatest;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Data
@AllArgsConstructor
public class YearReportParam {
    public static Map<YearReportParam, List<Object[]>> listData(){
        List<YearReportParam> list = new ArrayList<>();
        HashMap<YearReportParam, List<Object[]>> hm = new HashMap();
        list.add(new YearReportParam("","",""));


        list.add(new YearReportParam("Thành phố Hà Nội","",""));
//        hm.put(list.get(0), new ArrayList<>())
        list.add(new YearReportParam("Thành phố Hà Nội","Quận Hà Đông",""));
        list.add(new YearReportParam("Thành phố Hà Nội","Quận Hà Đông","Phường Nguyễn Trãi"));
        list.add(new YearReportParam("Thành phố Hồ Chí Minh","",""));
        list.add(new YearReportParam("Thành phố Hồ Chí Minh","Quận 1",""));
        list.add(new YearReportParam("Thành phố Hồ Chí Minh","Quận 1","Phường ABC"));

        return hm;
    }
    public static Object[] getResult(){
        Object[] object = new Object[2];
//        object.
        return object;
    }

    String province;
    String district;
    String ward;
}
