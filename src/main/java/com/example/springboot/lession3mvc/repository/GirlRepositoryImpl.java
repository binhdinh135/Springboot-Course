package com.example.springboot.lession3mvc.repository;

import com.example.springboot.lession3mvc.entity.GirlMvc;
import org.springframework.stereotype.Repository;

@Repository
public class GirlRepositoryImpl implements GirlRepository {
    @Override
    public GirlMvc getGirlByName(String name) {
        // Ở đây chúng ta ví dụ là database đã trả về
        // một cô gái với tên đúng như tham số
        // Còn thực tế phải query trong csđl nhé.

        return new GirlMvc(name);
    }
}
