package cn.doodlister.onlinejudge.dao;

import cn.doodlister.onlinejudge.entity.Contest;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ContestDao extends JpaRepository<Contest,Integer> {
}
