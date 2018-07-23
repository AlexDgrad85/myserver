package ru.alexdgrad.myserver.service;

import ru.alexdgrad.myserver.entity.Remind;

import java.util.List;
import java.util.Optional;

public interface ReminderService {
    List<Remind> getAll();
    Optional<Remind> getById(long id);
    Remind save(Remind remind);
    void remove(long id);
}
