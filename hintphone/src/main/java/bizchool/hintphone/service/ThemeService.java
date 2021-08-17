package bizchool.hintphone.service;


import bizchool.hintphone.Repository.ThemeRepository;
import bizchool.hintphone.domain.Theme;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
@RequiredArgsConstructor
public class ThemeService {
    private final ThemeRepository themeRepository;

    public List<Theme> findThemes() {
        return themeRepository.findAll();
    }
}
