package com.example.springboot.lession3mvc.repository;

import com.example.springboot.lession3mvc.entity.GirlMvc;

public interface GirlRepository {
    /*** Tìm kiếm một cô gái trong database theo tên
     * * @param name
     * * @return
     * */
    GirlMvc getGirlByName(String name);

}
