package id.qibee.watchlifecyclewithtimber;

import timber.log.Timber;

public class NotLoggingTree extends Timber.Tree {

    //todo make logging not available in release

    @Override
    protected void log(int priority, String tag, String message, Throwable t) {
        //no activity logging here
        //your log is not available in release
    }
}
