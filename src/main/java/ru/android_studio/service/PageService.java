package ru.android_studio.service;

import ru.android_studio.entities.Page;

import java.util.List;

public interface PageService {
	List<Page> findByTitle(String title);
}
