package com.how2java.pojo;

import org.springframework.stereotype.Component;

/**
 * @Auther: superhan
 * @Contact: chenchaohan@live.com
 * @Date: 2018/9/16 15:16
 * @Description:
 */
@Component("c")
public class Category {

        private int id;
        private String name="category 1";

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

}
