package com.avosh.baseproject.services.impl;

import com.avosh.baseproject.dto.SchedulerDto;
import com.avosh.baseproject.entity.Scheduler;
import com.avosh.baseproject.repository.SchedulerRepository;
import com.avosh.baseproject.services.SchedulerService;
import com.avosh.baseproject.util.Empty;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
import java.util.Optional;
@Service
@PreAuthorize("hasRole('ROLE_ADMIN')")
public class SchedulerServiceImpl implements SchedulerService {
    @Autowired
    private SchedulerRepository repository;

    @Override
    public void save(SchedulerDto dto) {
        Scheduler scheduler = new Scheduler();
        scheduler.setId(dto.getId());
        scheduler.setStatus(dto.getStatus());
        scheduler.setName(dto.getName());
        scheduler.setUpdateTime(new Date());
        repository.save(scheduler);
    }

    @Override
    public List<SchedulerDto> retrieveAll() {
        return null;
    }

    @Override
    public SchedulerDto retrieveById(Long id) {
        SchedulerDto dto = new SchedulerDto();
        Optional<Scheduler> res = repository.findById(id);
        if(Empty.isEmpty(res)){
            return null;
        }
        dto.setId(res.get().getId());
        dto.setUpdateTime(res.get().getUpdateTime());
        dto.setName(res.get().getName());
        dto.setStatus(res.get().getStatus());
        return dto;
    }

    @Override
    public void deleteById(Long id) {

    }
}
