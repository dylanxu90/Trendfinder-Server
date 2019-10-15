package club.doanything.trendfinder.api.entity;

import lombok.Builder;
import lombok.Data;

import java.io.Serializable;

@Data
@Builder
public class SysUser implements Serializable {

    private int id;

    private String userName;

    private String password;

    private String realName;

}
