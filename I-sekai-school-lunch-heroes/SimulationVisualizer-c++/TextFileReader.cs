using System.Collections;
using System.Collections.Generic;
using UnityEngine;
using System.IO;

public class TextFileReader : MonoBehaviour
{
    // Start is called before the first frame update
    public GameObject studentPrefab;
    public static TextAsset textFile;
    void Start()
    {
        Debug.Log("start");
        TextAsset textFile = Resources.Load("log") as TextAsset;
        StringReader stringReader = new StringReader(textFile.text);
        while (true)
        {
            string line = stringReader.ReadLine();
            if (line == null)
            {
                break;
            }
            Debug.Log(line);

        }
        for (int i = 1; i <= 1355; i++)
        {
            GameObject gameObject = Instantiate(studentPrefab);
            gameObject.name = string.Format("s{0}", i);

        }
    Debug.Log("done");
    }

    // Update is called once per frame
    void Update()
    {
    }
}
