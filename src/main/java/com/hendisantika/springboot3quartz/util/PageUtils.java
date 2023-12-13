package com.hendisantika.springboot3quartz.util;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;

/**
 * Created by IntelliJ IDEA.
 * Project : spring-boot3-quartz
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 12/13/23
 * Time: 07:36
 * To change this template use File | Settings | File Templates.
 */
@NoArgsConstructor(access = AccessLevel.PRIVATE)
public final class PageUtils {

    public static Pageable pageable(int page, int pageSize, String sortField, String sortDirection) {
        if (page == 0) {
            return Pageable.unpaged();
        }
        return PageRequest.of(
                page - 1, pageSize, Sort.by(Sort.Direction.fromString(sortDirection), sortField));
    }
}
