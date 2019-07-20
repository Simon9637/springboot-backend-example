package me.ele.dto;

import lombok.Builder;
import lombok.Data;

import javax.validation.constraints.NotEmpty;
import java.io.Serializable;

/**
 * @Author: liuhuan
 * @CreateDate: 2019/7/10
 * <p>Copyright: Copyright (c) 2019</p>
 */
@Data
@Builder
public class UserDTO implements Serializable {
    /**
     * @NotBlank：只用在String上，表示传进来的值不能为null，而且调用trim()后，长度必须大于0
     * @NotNull：不能为null，但可以为empty(分配了内存空间，但值为空)
     * @NotEmpty：不能为null，而且长度必须大于0
     */

    @NotEmpty(message = "name must not be empty")
    private String name;

    @NotEmpty(message = "age must not be empty")
    private Integer age;
}
