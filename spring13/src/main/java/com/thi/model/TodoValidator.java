package com.thi.model;
import java.util.Optional;

import org.thymeleaf.util.StringUtils;
public class TodoValidator {
	public boolean isValid(Todo todo) {
        return Optional.ofNullable(todo)
                       .filter(t -> !StringUtils.isEmpty(t.getTitle())) // Kiểm tra title khác rỗng
                       .filter(t -> !StringUtils.isEmpty(t.getDetail())) // Kiểm tra detail khác rỗng
                       .isPresent(); // Trả về true nếu hợp lệ, ngược lại false
    }

}
