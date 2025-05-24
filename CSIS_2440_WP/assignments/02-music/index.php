<!DOCTYPE html>
<html lang="en">
    <head>
        <title>Music</title>
        <link rel="stylesheet" href="css/styles.css"/>
    </head>

    <body>
        <h1>Josh Sorensen's Favorite Albums</h1>

        <div class="main">
            <?php
                function buildAlbumTable($albums)
                {
                    echo "<table>";

                    // 1. Build Header Row

                    $headers = ["Album Name", "Album Artist"];
                    echo "<tr>";
                    foreach ($headers as $header) {
                        echo "<th>$header</th>";
                    }
                    echo "</tr>";

                    // 2. Build Album Row

                    # randomly order album elements (shuffle them up)
                    shuffle($albums);

                    foreach ($albums as $album) {
                        $albumName = $album[0];
                        $albumArtist = $album[1];
                        $albumLink = $album[2];

                        echo "<tr>";
                        echo "<td><a href=\"$albumLink\" target=\"_blank\">$albumName</a></td>";
                        echo "<td>$albumArtist</td>";
                        echo "</tr>";
                    }

                    echo "</table>";
                }

                $albums = [
                    ["Goodbye & Good Riddance", "juice WRLD", "https://youtu.be/_bgjyNeN-Vo?si=Bg9yobq-cqdtqA6I"],
                    ["?", "xxxtentacion", "https://www.youtube.com/watch?v=0Hq1MRDaniA&list=PLic0Kn45RfnWUROowP-ghQAF7CEBi0t3Z"],
                    ["OK Computer", "radiohead", "https://www.youtube.com/watch?v=jNY_wLukVW0&list=PLxzSZG7g8c8x6GYz_FcNr-3zPQ7npP6WF"],
                    ["Die Lit", "playboi carti", "https://www.youtube.com/watch?v=tkPoOvVnbRk&list=PLAUxsgLNM2Bt8pdCb2zGbrcLAdLcetKvO"],
                    ["Melophobia", "cage the elephant", "https://www.youtube.com/watch?v=48xKTEmLVLI&list=PLC80P4gsPr-ZUMjAj9NgGr9yycb3fzcN_"],
                    ["Concept Vague", "night lovell", "https://www.youtube.com/watch?v=DPY3u-wGoZY&list=PLxyHhAA9SRj8xcAB4JRGK7Qf2xZ2Aeu4Y"],
                    ["Welcome Home", "aries", "https://www.youtube.com/watch?v=osE9DTIr7hg&list=PLeXgkVRgpo1P3jADZZoXuROoD0QiqE7ZZ"],
                    ["Finally Rich", "chief keef", "https://www.youtube.com/watch?v=0HXFlBAojZI"],
                    ["Death Race For Love", "juice WRLD", "https://www.youtube.com/watch?v=9LSyWM2CL-U&list=PLau9bkm0iK9t1DPKultYqH3q8yWpg-SvR"],
                    ["deadroses", "blackbear", "https://www.youtube.com/watch?v=e0Wobcioc8o&list=PLBQ7aZk9khNgpN2TVUn6qyKpYnATMQigs"]
                ];
                buildAlbumTable($albums);
            ?>
        </div>

    </body>
</html>