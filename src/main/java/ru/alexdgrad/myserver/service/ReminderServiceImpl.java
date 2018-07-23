package ru.alexdgrad.myserver.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.alexdgrad.myserver.entity.Remind;
import ru.alexdgrad.myserver.repository.RemindRepository;

import java.util.List;
import java.util.Optional;

@Service
public class ReminderServiceImpl implements ReminderService{

    @Autowired
    private RemindRepository repository;

    @Override
    public List<Remind> getAll() {
        return repository.findAll();
    }

    @Override
    public Optional<Remind> getById(long id) {
        return repository.findById(id);
    }

    @Override
    public Remind save(Remind remind) {
        return repository.saveAndFlush(remind);
    }

    @Override
    public void remove(long id) {
        repository.deleteById(id);

    }
}
