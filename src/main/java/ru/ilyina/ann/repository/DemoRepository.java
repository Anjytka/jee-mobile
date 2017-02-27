package ru.ilyina.ann.repository;

import ru.ilyina.ann.domain.MDemo;

import javax.ejb.Local;
import java.util.List;

/**
 * Created by anjytka on 27.02.17.
 */
@Local
public interface DemoRepository {
    List<MDemo> getAll();
}
