package me.ele.controller;

import me.ele.dto.UserDTO;
import me.ele.exception.RecordNotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

/**
 * @Author: liuhuan
 * @CreateDate: 2019/7/10
 * <p>Copyright: Copyright (c) 2019</p>
 */
@RestController
@Validated
@RequestMapping("user")
public class UserController {

    @GetMapping("/test")
    public ResponseEntity<Object> test() {
        UserDTO userDTO = UserDTO.builder()
            .name("zhang")
            .age(20)
            .build();
        return new ResponseEntity<>(userDTO, HttpStatus.OK);
    }

    @GetMapping("/testR")
    public ResponseEntity<Object> testRecordNotFoundException() {
        throw new RecordNotFoundException("Invalid user id");
    }

    @GetMapping("/testE")
    public ResponseEntity<Object> testException() {
        throw new RuntimeException("Runtime Exception");
    }

    @PostMapping("/testM")
    public ResponseEntity<Object> testMethodArgumentNotValid(@RequestBody @Valid UserDTO userDTO) {
        return new ResponseEntity<>(userDTO, HttpStatus.OK);
    }

}
