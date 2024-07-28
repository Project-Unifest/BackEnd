package UniFest.dto.request.announcement;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class AddAnnouncementRequest {
    private String title;
    private String body;
}