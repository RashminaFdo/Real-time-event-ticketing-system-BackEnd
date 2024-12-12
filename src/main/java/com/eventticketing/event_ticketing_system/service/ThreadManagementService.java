package com.eventticketing.event_ticketing_system.service;

import org.springframework.stereotype.Service;

@Service
// This class is used to manage threads.
public class ThreadManagementService {

    public void stopThreads(Thread... threads) {
        for (Thread thread : threads) {
            if (thread != null && thread.isAlive()) {
                thread.interrupt();
            }
        }
    }
}
