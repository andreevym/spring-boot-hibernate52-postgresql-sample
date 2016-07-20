package ru.android_studio.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ru.android_studio.entities.Page;
import ru.android_studio.repository.PageRepository;

import java.util.List;

@Service("pageService")
public class PageServiceImpl implements PageService {

    @Autowired
    private PageRepository pageRepository;

    @Transactional
    public Page save(Page page) {
        return pageRepository.save(page);
    }

    public List<Page> findByTitle(String title) {
        return pageRepository.findByTitleIgnoreCaseContaining(title);
    }
}
