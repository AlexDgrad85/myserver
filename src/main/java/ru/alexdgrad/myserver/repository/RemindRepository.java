package ru.alexdgrad.myserver.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.alexdgrad.myserver.entity.Remind;

public interface RemindRepository extends JpaRepository<Remind,Long> {

}
