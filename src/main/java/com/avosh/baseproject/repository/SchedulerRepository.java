package com.avosh.baseproject.repository;

import com.avosh.baseproject.entity.Scheduler;

import java.util.Optional;

public interface SchedulerRepository extends BaseRepository<Scheduler, Long> {
    Optional<Scheduler> findById(Long id);
}
