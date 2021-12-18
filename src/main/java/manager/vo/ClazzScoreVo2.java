package manager.vo;

import lombok.Data;
import lombok.ToString;

import java.io.Serializable;
import java.time.LocalDateTime;


@ToString
@Data
public class ClazzScoreVo2 implements Serializable {

    private String name;		//班级名称
    private double score0;           //理论考核
    private double score1;           //理论考核
    private Integer type;        //0是理论考核，1是实验考核

    private String sn;
    private String studentName;

    private LocalDateTime createDate;    //创建日期
    private LocalDateTime updateDate;    //修改者
}