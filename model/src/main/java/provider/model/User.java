package provider.model;

import lombok.Data;

import java.io.Serializable;

/**
 * Created by yangguiyun on 2017/6/1.
 */

@Data
public class User extends BaseEntity implements Serializable {
    private Long id;
    private String password;
    private String name;
    private int age;
    private String phone;
}
