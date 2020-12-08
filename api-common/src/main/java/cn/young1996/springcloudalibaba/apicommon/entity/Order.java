package cn.young1996.springcloudalibaba.apicommon.entity;

import lombok.*;

import java.io.Serializable;

/**
 * @auther Young
 * @date
 * @description
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
//@EqualsAndHashCode
public class Order implements Serializable {
    private String id;
    private String createDate;
    private String userId;
    private double price;
}
