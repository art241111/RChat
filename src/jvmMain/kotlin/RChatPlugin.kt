import androidx.compose.runtime.Composable
import client.ClientsContext
import file.FilesContext
import note.NoteContext
import robot.RobotsContext
import window.WindowContext

class RChatPlugin: KRPlugin {
    private lateinit var robotsContext: RobotsContext
    @Composable
    override fun content() {
        if (::robotsContext.isInitialized) {
            RChat(robotsContext)
        }
    }

    override fun init(
        windowContext: WindowContext,
        robotsContext: RobotsContext,
        clientsContext: ClientsContext,
        noteContext: NoteContext,
        filesContext: FilesContext
    ) {
        this.robotsContext = robotsContext
    }
}