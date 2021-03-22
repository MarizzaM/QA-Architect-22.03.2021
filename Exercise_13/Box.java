package com.app;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@ToString
@Getter
@Setter
public class Box {

    private String m_content;
    private String m_owner;

    public Box(String m_content, String m_owner) {
        this.m_content = m_content;
        this.m_owner = m_owner;
    }
}
