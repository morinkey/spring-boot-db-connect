package jp.co.example.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import jp.co.example.entity.Sample;

public interface SampleDao extends JpaRepository <Sample, Integer> {

}
