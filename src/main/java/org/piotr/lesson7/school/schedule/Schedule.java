package org.piotr.lesson7.school.schedule;

import lombok.*;
import org.piotr.lesson7.school.schedule.meeting.Lesson;

import java.time.DayOfWeek;
import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Getter
@Setter
@RequiredArgsConstructor
public class Schedule {
    private Map<DayOfWeek, List<Lesson>> lessons = new HashMap<>();
    @NonNull private LocalDateTime validFrom;
    @NonNull private LocalDateTime validTo;
    @NonNull private LocalDateTime lastUpdate;
}
