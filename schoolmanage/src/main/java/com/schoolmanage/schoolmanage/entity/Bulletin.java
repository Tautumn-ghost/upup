package com.schoolmanage.schoolmanage.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.sql.Time;
import java.sql.Timestamp;

@Entity
@Data
//@Table(name = "bulletin")
public class Bulletin {
    private String Bno;

    @Id
    private String Bname;
    private Timestamp Btime;
    private String Btext;
}
