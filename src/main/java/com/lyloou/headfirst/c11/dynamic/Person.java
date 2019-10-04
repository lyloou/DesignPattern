package com.lyloou.headfirst.c11.dynamic;

/**
 * @author lyloou
 * @date 2019/10/04 21:24
 */
public interface Person {
    String getName();

    String getGender();

    String getInterests();

    int getHotOrNotRating();

    void setName(String name);

    void setGender(String gender);

    void setInterests(String interests);

    void setHotOrNotRating(int rating);

}
