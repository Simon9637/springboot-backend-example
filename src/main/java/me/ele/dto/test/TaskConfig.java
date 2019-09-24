package me.ele.dto.test;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Author: liuhuan
 * @CreateDate: 2019/9/24
 * <p>Copyright: Copyright (c) 2019</p>
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class TaskConfig {
    private ProduceConfig produceConfig;
    private ConsumeConfig consumeConfig;

    private String addr;
}
