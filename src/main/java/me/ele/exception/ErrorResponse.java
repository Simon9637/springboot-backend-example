package me.ele.exception;

import lombok.Builder;
import lombok.Data;

import javax.xml.bind.annotation.XmlRootElement;
import java.util.List;

/**
 * @Author: liuhuan
 * @CreateDate: 2019/7/10
 * <p>Copyright: Copyright (c) 2019</p>
 */
@XmlRootElement(name = "error")
@Data
@Builder
public class ErrorResponse {
    //General error message about nature of error
    private String msg;

    //Specific errors in API request processing
    private List<String> details;
}
