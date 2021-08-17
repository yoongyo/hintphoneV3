package bizchool.hintphone.api;


import bizchool.hintphone.domain.Theme;
import bizchool.hintphone.service.ThemeService;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequiredArgsConstructor
public class ThemeApiController {

    private final ThemeService themeService;

    @GetMapping("/api/theme-list")
    public Result themeList() {
        List<Theme> findThemes = themeService.findThemes();
        List<ThemeDto> collect = findThemes.stream()
                .map(theme -> new ThemeDto((theme.getName())))
                .collect(Collectors.toList());

        return new Result(collect.size(), collect);
    }

    @Data
    @AllArgsConstructor
    private class Result<T> {
        private int count;
        private T data;
    }

    @Data
    @AllArgsConstructor
    static class ThemeDto {
        private String name;
    }
}
