package com.bilgeadam.java4mono.repository.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "tblhizmetli")
@Entity
public class Hizmetli {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    String ad;
    String adres;
    String telefon;

    //kayıt aktif-pasif

    boolean isactive;

    //oluşturulma güncellenme tarihleri

    Long createdate;
    Long updatedate;

    //kaydın durumu
    //0- yeni kayıt
    //1-onaylanmış kayıt
    //2- pasif bloklanmış
    //3- pasif silinmiş

    Integer state;
}
