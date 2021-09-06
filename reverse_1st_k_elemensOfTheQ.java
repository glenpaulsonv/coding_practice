for (int i = 0; i < k; i++) {
            stac.push(queue.peek());
            queue.remove();
        }
        while (!stac.empty()) {
            queue.add(stac.peek());
            stac.pop();
        }
        for (int i = 0; i < queue.size() - k; i++) {
            queue.add(queue.peek());
            queue.remove();
        }
        return queue;