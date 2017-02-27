package ru.ilyina.ann.service;

import ru.ilyina.ann.domain.MDemo;
import ru.ilyina.ann.repository.DemoRepository;

import javax.ejb.Stateless;
import javax.inject.Inject;
import java.util.List;

/**
 * Created by anjytka on 28.02.17.
 */
@Stateless
public class DemoServiceImpl implements DemoService {

    @Inject
    private DemoRepository demoRepository;

    @Override
    public List<MDemo> getAll() {
        return demoRepository.getAll();
    }
}
