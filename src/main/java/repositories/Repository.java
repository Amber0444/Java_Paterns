package repositories;

import Movies.Snapshot;

import java.util.List;

public class Repository {
    public List<Snapshot> snapshotlist;

    public void add(Snapshot snapshot) {
        snapshotlist.add(snapshot);
    }

    public Snapshot restore() {
        return snapshotlist.getLast();
    }
}
