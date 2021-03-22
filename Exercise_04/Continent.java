package com.app;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@ToString
@Getter
@Setter
public class Continent implements Comparable<Continent>{
    private String m_name;
    private Double m_size;
    private Integer m_population;

    public Continent(String m_name, double m_size, int m_population) {
        this.m_name = m_name;
        this.m_size = m_size;
        this.m_population = m_population;
    }

    @Override
    public int compareTo(Continent o) {
        return this.m_name.compareTo(o.m_name);
    }
}
